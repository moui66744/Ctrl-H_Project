import * as fs from "fs";
import * as vscode from "vscode";
import * as path from "path";
import { performance } from "perf_hooks";

export var jarPath = path.normalize(__dirname + "/../lib/ctrl-h.jar");
export var jsonPath = path.normalize(__dirname + "/../lib/out/res.json");

export class Query {
    private queryLanguage: string = "''";

    constructor(
        public targetLanguage: string,
        public filePath: string,
        queryLanguage: string,
    ) {
        this.queryLanguage = "'" + queryLanguage + "'";
    }
    public async execQuery() {
        const util = require("util");
        const exec = util.promisify(require("child_process").exec);
        // const childProcess = require('child_process');
        const cmd = "java -jar " + jarPath
            + " -p " + this.filePath
            + " -t " + this.queryLanguage
            + " -d " + jsonPath
            + " -l " + this.targetLanguage
            ;
        const start = performance.now();
        const { stdout, stderr } = await exec(cmd);
        const end = performance.now();
        vscode.window.showInformationMessage("The program execution time: " + (end - start) + "ms.");
        
        if (stderr === "No matching results.\n") {
            throw new Error(stderr);
        } else if (stderr !== "") {
            throw new Error("Query Language or Source Code syntax error: " + stderr);
            
        }
    }
}

export function showJSON() {
    vscode.commands.executeCommand(
        'vscode.open',
        vscode.Uri.file(jsonPath),
    );
}
