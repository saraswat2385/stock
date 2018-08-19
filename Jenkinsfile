pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                gradlew clean build -x test
            }
        }
        stage('Test') {
            steps {
                gradlew test
            }
        }
        stage('Build') {
            steps {
                gradlew docker
            }
        }
        stage('Publish') {
            steps {
                gradlew dockerPush
            }
        }
    }
}
