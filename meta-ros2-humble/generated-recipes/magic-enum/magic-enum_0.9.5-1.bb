# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Static reflection for enums (to string, from string, iteration) for modern C++,     work with any enum type without any macro or boilerplate code"
AUTHOR = "Neargye <neargye@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "magic_enum"
ROS_BPN = "magic_enum"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/magic_enum-release/archive/release/humble/magic_enum/0.9.5-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/magic_enum"
SRC_URI = "git://github.com/ros2-gbp/magic_enum-release;${ROS_BRANCH};protocol=https"
SRCREV = "bd9c11295290d08798cb0e9c372719bdf6c3b207"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
