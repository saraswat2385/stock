node {
        stage('Compile') {
           
                sh "./gradlew clean build -x test"

        }
        stage('Test') {
        
                sh "./gradlew test"
   
        }
        stage('Build') {
         
                sh "./gradlew docker"
        
        }
        stage('Publish') {
        
                sh "./gradlew dockerPush"
       
        }
}
