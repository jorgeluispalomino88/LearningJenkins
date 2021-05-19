pipeline {
    agent any

    stages {
        // stage('Checkout') {
        //     steps {
        //         // Get some code from a GitHub repository
        //         git 'https://github.com/jorgeluispalomino88/LearningJenkins.git'
        //     }
        // }

           //commit stage
            stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        //commit stage
        stage('Unit test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

