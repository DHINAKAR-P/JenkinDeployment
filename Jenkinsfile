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
                    bat '''
                        junit 'target/surefire-reports/**/*.xml'
                        dir                   
                        echo "test copy"
                        copy "C:/Windows/system32/config/systemprofile/AppData/Local/Jenkins/.jenkins/workspace/pipeline-script-test/target/Jenkin-0.0.1-SNAPSHOT.war" "C:/Program Files/Apache Software Foundation/Tomcat 9.0/webapps/"
                    '''
                }
            }
        }
    }
}