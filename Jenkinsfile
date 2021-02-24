pipeline {
    agent any
    tools {
        mavenhome 'apache-maven-3.6.3' 
    }
    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}