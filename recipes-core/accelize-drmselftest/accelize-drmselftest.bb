#
# This is drmselftest application recipe
#

SUMMARY = "Accelize drmselftest application"
SECTION = "PETALINUX/apps"
LICENSE = "CLOSED"

SRC_URI = " \
    file://drmselftest.cpp \
    file://Makefile \
    file://xlz-drmselftest-nodelock-conf.json \
    file://xlz-drmselftest-floating-conf.json \
    "

export STAGING_INCDIR
TARGET_CC_ARCH += "${LDFLAGS}"

DEPENDS += "xrt jsoncpp libaccelize-drm"
RDEPENDS:${PN} += "accelize-drmselftest-fpga"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${sysconfdir}/xilinx_appstore
    install -m 0755 ${S}/xlz-drmselftest ${D}${bindir}
    install -m 0644 ${S}/xlz-drmselftest-nodelock-conf.json ${D}${bindir}
    install -m 0644 ${S}/xlz-drmselftest-floating-conf.json ${D}${bindir}
}

pkg_postinst:${PN} () {
    #!/bin/sh -e
    chmod u+s $D${bindir}/xlz-drmselftest
}
