pipeline {
    agent any
    tools {
        maven 'maven_java'
        jdk 'Jenkin_java'
    }
    stages {
        stage ('Initialize') {
            steps {
                bat  '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                bat  'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                    bat  'pwd' 
                }
            }
        }
    }
}