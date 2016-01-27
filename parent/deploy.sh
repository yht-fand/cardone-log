if [ -e 'parent' ]; then
cd parent
mvn clean install source:jar deploy
cd ..
fi
mvn clean install source:jar deploy
