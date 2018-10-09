pipeline {
  options { disableConcurrentBuilds() }
  agent any
  stages {
    stage('Build') {
      steps {
        echo('Building...')
        sh 'sudo mvn -B -DskipTests clean install'
      }
    }
    stage('Test') {
      post {
        always {
          junit '**/target/surefire-reports/*.xml'
        }
      }
      steps {
        echo('Testing...')
        sh 'mvn test'
      }
    }
    stage('Deploy') {
      steps {
        echo('Deploying...')
        sh 'make publish'
      }
    }
  }
}