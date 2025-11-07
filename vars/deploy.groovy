def call() {
    sh '''
        echo "Stopping old containers..."
        docker compose down || true
        echo "Starting new containers..."
        docker compose up -d
    '''
}
