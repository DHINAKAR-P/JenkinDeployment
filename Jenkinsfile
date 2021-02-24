pipeline {
    agent any
    tools {
        maven 'mavenhome' 
    }
    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}