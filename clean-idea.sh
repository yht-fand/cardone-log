#!/bin/bash

sh clean.sh
rm -rfv .idea
find . -name '*.iml' -exec rm -fv {} \;
