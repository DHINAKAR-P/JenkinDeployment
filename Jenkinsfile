pipeline {
    agent any
    tools {
        maven 'mavenhome'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                    sh 'scp /var/jenkins_home/workspace/java-pipeline-project/target/Jenkin-0.0.1-SNAPSHOT.war  root@01fe67e30497:/usr/local/tomcat/webapps/' 
                }
            }
        }
    }
}