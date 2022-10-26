#
# This file is the Accelize DrmSelfTest PL recipe.
#

SUMMARY = "Accelize DrmSelfTest Firmware to use fpgamanager class"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit fpgamanager_custom

PKGR = "1.pl${@d.getVar('XILINX_VER_MAIN').replace('.', '_')}"

SRC_URI = " \
           file://shell.json \
           file://kv260-aibox-reid.dtsi \
           file://system.bit \
           file://accelize-drmselftest-firmware.xclbin \
          "

S = "${WORKDIR}"
