pipeline {

    agent any

    environment {
        IMAGE_NAME = "demo-aws-mgm"
    }

    stages {
		stage('Ver Java') {
    steps {
        sh 'java -version'
    }
}

       // 💡 Borramos la etapa 'Clonar' porque Jenkins ya lo hace solo al inicio

        stage('Build Maven') {
            steps {
				// 1. Damos permisos de ejecución al wrapper
                 sh 'chmod +x mvnw'
                
                // 2. Ejecutamos la compilación con el archivo clonado
                sh './mvnw clean compile'
            }
        }

        stage('Build Docker') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

         stage('Run Container') {
            steps {

                sh '''
                docker stop demo-container || true
                docker rm demo-container || true

                docker run -d \
                    --name demo-container \
                    -p 8081:8081 \
                    $IMAGE_NAME
                '''
            }
         }
    }
}