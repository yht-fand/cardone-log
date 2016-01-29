#!/bin/bash

if [ -e 'parent' ]; then
cd parent
mvn clean install
cd ..
fi
mvn clean install