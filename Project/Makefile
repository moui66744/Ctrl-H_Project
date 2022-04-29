.PHONY: env parser

TARGET_LANGUAGE ?= Java
GRAMMAR_NAME ?= grammar/$(TARGET_LANGUAGE).g4
PARSER_TARGET_LANGUAGE ?= Java
TARGET_PACKAGE ?= $(TARGET_LANGUAGE)Parser
ANTLR_FLAGS += -visitor  -listener
ANTLR_PATH = lib/antlr-4.10.1-complete.jar
ANTLR4=java -Xmx500M -cp $(ANTLR_PATH) org.antlr.v4.Tool

parser:
	$(ANTLR4) $(GRAMMAR_NAME) -o /mnt/e/csrc/$(TARGET_PACKAGE) -package $(TARGET_PACKAGE) \
	$(ANTLR_FLAGS) -Dlanguage=$(PARSER_TARGET_LANGUAGE)
	rm -r $(TARGET_PACKAGE)/grammar

