pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'gradlew clean build -x test'
            }
        }
        stage('Test') {
            steps {
                bat 'gradlew test'
            }
        }
        stage('Build') {
            steps {
                bat 'gradlew docker'
            }
        }
        stage('Publish') {
            steps {
                bat 'gradlew dockerPush'
            }
        }
    }
}
