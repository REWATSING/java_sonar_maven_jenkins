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
                        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=java_sonar_mave_jenkins_project -Dsonar.projectName='java_sonar_mave_jenkins_project'"
                    }
                }
            }
        }
    }
}
