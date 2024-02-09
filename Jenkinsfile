pipeline {
	agent any 
	stages {
	    stage ("Clone the existing_repo") {
	        steps {
			    sh "rm -rf helloapp"
	            sh "git clone https://avinashbitbucket517@bitbucket.org/avinashprojects/helloapp.git"
	        }
	    }
		stage ("1. Clean the old builds") {
			steps {
				sh "mvn -f helloapp/ clean" 
			}
		}
		stage ("2. Build the new package") {
			steps {
				sh "mvn -f helloapp/ install"
			}
		}
		stage ("3. Deploy the new package") {
			steps {
				sh "cp /var/lib/jenkins/workspace/First_Maven_PipeLineProject/helloapp/target/helloapp-0.0.1-SNAPSHOT.jar /var/lib/jenkins/helloapp.jar"
				sh "java -jar helloapp.jar"
			}
		}
	}
}