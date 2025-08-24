def call(String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:'dockerhubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){ 
  sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker compose up -d "
}
