pipeline {
    agent any
    stages {
        stage('limpiar el proyecto') {
            steps {
               bat 'gradle clean build -x test'
            }
        }
        stage('compilar') {
            steps {
               bat 'gradle build'
            }
        }
        stage('ejecutar test') {
            steps {
               bat 'gradle test'
            }
        }

}
}