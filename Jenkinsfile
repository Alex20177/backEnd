pipeline{

	agent any

	tools { 

    	maven 'MVN-3.8.3' 
		jdk 'JDK-8'
		
    }

	libraries{

		lib('common-libs')

	}
	
	stages{
	
		stage("build"){
		
			steps{

				script {
					wildfly.deploy("jboss-credentials")
				}
							
			}
		
		}	
		
	}
	
}