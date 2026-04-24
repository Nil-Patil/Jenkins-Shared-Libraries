def call(String ProjectName, String Tag){
   sh "docker build -t ${ProjectName}:${Tag} ."
}
