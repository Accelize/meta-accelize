# meta-accelize

This layer collects the recipes required to build and run the Linux 
applications that implement the Accelize DRM solution for embedded device.


Dependencies
============

URI	git://github.com/ProvenRun/meta-provenrun
branch: master


Patches
=======

Please submit any patches/modification against the meta-accelize layer 
via a pull requests on the Accelize github at //https://github.com/Accelize/meta-accelize

Maintainer: Accelize Support <support@accelize.com>


Usage
=====

To see the DRM test help: drmtest

To execute the DRM test in nodelock mode: sudo drmtest 0

To execute the DRM test in metering mode: sudo drmtest 1

Note: An Internet connection could be required to run the DRM test from the board. 
      See the DRM test help for more details.


Documentation
=============

DRM global documentation: https://tech.accelize.com/documentation/stable/index.html

To implement your own PL design, refer to: https://tech.accelize.com/documentation/stable/drm_getting_started.html#adapt-your-fpga-design

To modify your PS application, refer to: https://tech.accelize.com/documentation/stable/drm_getting_started.html#adapt-your-software-application
