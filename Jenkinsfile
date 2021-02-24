pipeline {
    agent any
    tools {
        maven-home 'apache-maven-3.6.3' 
    }
    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}