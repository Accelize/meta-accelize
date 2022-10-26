
Q := @

CFLAGS += -I. -I${STAGING_INCDIR}/xrt
LDFLAGS += -lrt -lpthread -lstdc++ -lxrt_core -lxilinxopencl -ljsoncpp -laccelize_drm

xlz-drmselftest: drmselftest.cpp
	@echo "  $(CXX)      $<"
	$(Q)$(CXX) $(CFLAGS) -std=c++11 $^ -o $@ $(LDFLAGS)

all: xlz-drmselftest

clean:
	@rm -f xlz-drmselftest

.PHONY: clean
