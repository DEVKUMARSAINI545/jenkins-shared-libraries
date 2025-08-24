def run(String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:'dockerhubCred', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){ 
  sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}
  }
  sh "docker compose up -d "
}
