def clone(String url,String branch){
  echo "This is cloning the code "
    git url : "${url}", branch: "${branch}" 
}
