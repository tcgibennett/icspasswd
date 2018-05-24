mvn validate
mvn test
mvn clean compile assembly:single
cp ./target/icspasswd-1.0-jar-with-dependencies.jar ./icspasswd.jar
cat stub.sh icspasswd.jar > icspasswd && chmod 777 icspasswd
~/Downloads/launch4j/launch4j ~/metaopsis/icspasswd.xml

cp ./icspasswd ~/IdeaProjects/icscmd
cp ./icspasswd.exe ~/IdeaProjects/icscmd