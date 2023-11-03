pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo  "building mohamed"
            }
        }
        
        stage('Test') {
            steps {
                echo  "testing mohamed"
            }
        }

        stage('Deploy') {
            steps {
                
                echo  "deploy mohamed"  
            }
        }
