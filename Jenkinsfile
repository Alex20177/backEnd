pipeline{

	agent any

	tools { 
    	maven 'MVN-3.8.3' 
		jdk 'JDK-8'
    }

	parameters {

   		string(name: 'STATEMENT', defaultValue: 'hello; ls /', description: 'What should I say?')
		   
  	}
	
	stages{
	
		stage('build'){
		
			steps{
				
				sh "echo ${STATEMENT}" //print root directory
				echo "hello world"
				echo "PATH = ${PATH}"
				echo "${env.BUILD_NUMBER}"
				echo "${env.GIT_BRANCH}"
				sh "printenv"
				sh 'date'
				sh 'mvn -DskipTests=true clean install'
				archiveArtifacts(allowEmptyArchive: true, artifacts: 'target/*.war')
			
			}
		
		}

		stage('commits'){
			steps{
				sh 'git'
				// shortCommit = sh(returnStdout:true, script: "git log -n 1 --pretty=format:'%h'").trim();
				// echo "$shortCommit"
			}
		}
		
	}

	post{
		always{
			echo "post section with always options"
		}
		//Other options : unstable, success, failure, and changed
	}
	
}