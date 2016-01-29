#!/bin/bash

mvn clean 
find . -name '*.log' -exec rm -fv {} \;
rm -rfv dist
