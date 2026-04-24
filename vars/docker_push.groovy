def call(String Project, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: 'DockerhubPass', usernameVariable: 'DockerhubUser')]) {
        sh '''
           docker login -u $DockerhubUser -p $DockerhubPass
           docker image tag notesapp:latest $DockerhubUser/mission:latest
           docker push $DockerhubUser/mission:latest
        '''
  }
}
