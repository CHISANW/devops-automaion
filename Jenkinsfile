pipeline{
    agent any
    tools{
        gradle 'Gradle 8.5'
    }
    stages{
        stage('Build'){
            steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/CHISANW/devops-automaion']])
                bat 'gradle clean build'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t keuye0638/jenkins-automations .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpwd')]) {
                       bat "docker login -u keuye0638 -p $dockerpwd"
                    }
                    bat 'docker push keuye0638/jenkins-automations'
                }
            }
        }
    }
}