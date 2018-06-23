#!/usr/bin/env bash

set -e

rm -rf $HOME/.ivy2/cache/com.example/ &&
rm -rf $HOME/.ivy2/local/ &&
cd library_x &&
sbt clean publishLocal v2/mimaReportBinaryIssues &&
cd .. &&
sbt clean update main/run
