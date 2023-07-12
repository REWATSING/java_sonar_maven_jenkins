pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://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@github.com/REWATSING/java_sonar_maven_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                script {
                    def mvn = tool 'Maven'
                    withSonarQubeEnv {
                        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=java_sonar_mave_jenkins_project -Dsonar.projectName='java_sonar_mave_jenkins_project' -Dsonar.token=sqp_7fc27834d66aed3498efcbef7e693c4402cac453"
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                // Run the Docker container
                sh 'docker run -d -p 9090:9090 --name rewat_tomcat_container tomcat:latest'
                sh 'docker build -t rewat_tomcat_container .'

            }
        }
    }
}
