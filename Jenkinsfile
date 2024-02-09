pipeline {
	agent any 
	stages {
	    stage ("Clone the existing_repo") {
	        steps {
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
				echo  "succssfully deployed"
			}
		}
	}
}