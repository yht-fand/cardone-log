mvn clean package
rm -rfv dist/$1
mkdir -p dist/$1/provider
cp -rf provider/config dist/$1/provider/config
cp -rf provider/config-$1 dist/$1/provider/config
cp -rf provider/run*.sh dist/$1/provider
cp provider/target/cardone-log-*.jar dist/$1/provider
mkdir -p dist/$1/consumer
cp -rf consumer/webapp dist/$1/consumer/webapp
cp -rf consumer/views dist/$1/consumer/views
cp -rf consumer/config dist/$1/consumer/config
cp -rf consumer/config-$1 dist/$1/consumer/config
cp -rf consumer/run*.sh dist/$1/consumer
cp -rf consumer/target/cardone-log-*.jar dist/$1/consumer