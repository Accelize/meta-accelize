#
# This is the drmselftest application recipe
#

SUMMARY = "drmselftest application"
SECTION = "PETALINUX/apps"
LICENSE = "CLOSED"

SRC_URI = " \
    file://drmselftest.cpp \
    file://Makefile \
    file://kria_cred.json \
    file://kria_nodelock_conf.json \
    file://kria_metering_conf.json \
    "

export STAGING_INCDIR
TARGET_CC_ARCH += "${LDFLAGS}"

DEPENDS += "xrt jsoncpp libaccelize-drm"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/drmselftest ${D}${bindir}
    install -m 0644 ${S}/kria_cred.json ${D}${bindir}
    install -m 0644 ${S}/kria_nodelock_conf.json ${D}${bindir}
    install -m 0644 ${S}/kria_metering_conf.json ${D}${bindir}
}

