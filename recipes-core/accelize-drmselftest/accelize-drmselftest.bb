#
# This is the Accelize's drmselftest application recipe
#

SUMMARY = "Accelize DrmSelfTest application"
SECTION = "PETALINUX/apps"
LICENSE = "CLOSED"

SRC_URI = "file://drmselftest.cpp \
           file://Makefile \
           file://README.md \
           file://xlz-drmselftest-nodelock-conf.json \
           file://xlz-drmselftest-floating-conf.json \
          "

PKGR = "1.pl${@d.getVar('XILINX_VER_MAIN').replace('.', '_')}"

export STAGING_INCDIR
TARGET_CC_ARCH += "${LDFLAGS}"

DEPENDS += " jsoncpp libaccelize-drm xrt"
RDEPENDS_${PN} += " accelize-drmselftest-firmware"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${sysconfdir}/xilinx_appstore
    install -d ${D}${sysconfdir}/xilinx_appstore/accelize-drmselftest
    install -m 0755 ${S}/xlz-drmselftest ${D}${bindir}
    install -m 0644 ${S}/README.md ${D}${sysconfdir}/xilinx_appstore/accelize-drmselftest/
    install -m 0644 ${S}/xlz-drmselftest-nodelock-conf.json ${D}${sysconfdir}/xilinx_appstore/accelize-drmselftest/
    install -m 0644 ${S}/xlz-drmselftest-floating-conf.json ${D}${sysconfdir}/xilinx_appstore/accelize-drmselftest/
}

pkg_postinst_${PN} () {
    #!/bin/sh -e
    chmod u+s $D${bindir}/xlz-drmselftest
    chmod a+rw $D${sysconfdir}/xilinx_appstore
}
