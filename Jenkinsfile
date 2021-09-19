pipeline{

	agent any

	tools { 
    	maven 'MVN-3.8.3' 
		jdk 'JDK-8'
    }

	libraries{
		lib('Common-libs')
	}

	//This vars can be use in all the stages
	environment{			
		JBOSS_CREDS = credentials('jboss-credentials')//_USR _PWD
	}

	// parameters {
    // 	string(name: 'STATEMENT', defaultValue: 'hello; ls /', description: 'What should I say?')
	// 	string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
  	// }
	
	stages{
	
		stage("build"){
		
			steps{

				script{
					wildfly.undeploy('my-jboss-user','my-jboss-pass')
				}
				
				echo 'build war'
				sh 'mvn -DskipTests=true -DJBOSS_USER=${JBOSS_CREDS_USR} -DJBOSS_PASS=${JBOSS_CREDS_PSW} wildfly:undeploy'
				sleep(time:25,unit:"SECONDS")
				sh 'mvn -DskipTests=true -DJBOSS_USER=${JBOSS_CREDS_USR} -DJBOSS_PASS=${JBOSS_CREDS_PSW} wildfly:deploy'
				archiveArtifacts(allowEmptyArchive: false, artifacts: 'target/*.war')
			
			}
		
		}



		// stage("deploy"){

		// 	steps{
		// 		echo 'Deploying'
		// 	}

		// }		
		
	}

	// post{
	// 	always{
	// 		echo "post section with always options"
	// 	}
	// 	//Other options : unstable, success, failure, and changed
	// }
	
}