# meta-accelize

This layer collects the recipes required to build and run the Linux 
applications that implement the Accelize DRM solution for embedded device.


Dependencies
============

URI	git://github.com/ProvenRun/meta-provenrun
branch: honister


Patches
=======

Please submit any patches/modification against the meta-accelize layer 
via a pull requests on the Accelize github at //https://github.com/Accelize/meta-accelize

Maintainer: Accelize Support <support@accelize.com>


Usage
=====

To see the DRM test help: drmselftest
To execute the DRM test in nodelock mode: sudo drmselftest 0
To execute the DRM test in metering mode: sudo drmselftest 1

Note: An Internet connection could be required to run the DRM test from the board. 
      See the DRM test help for more details.


Documentation
=============

Accelize DRM central documentation: https://wiki.accelize.com/home/index.html
Accelize DRM Kria documentation: https://wiki.accelize.com/home/How-to-Publish-a-Kria-Application-on-the-Xilinx-Kria-Store.147226634.html
