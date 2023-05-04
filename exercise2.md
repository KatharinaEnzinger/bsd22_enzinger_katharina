# GIT INDRODUCTION 

## description of individual commands  
<br>

### git-config:

**Function:** allows configuration of Git parameters at global or project level, such as username and email address.  
**Parameters:** different options can be passed, depending on which setting is to be configured.  
**Affected Data:** Meta information such as author and email address for commits.  
**Change location:** local

<br>

### git init:

**Function:** initializes an empty Git repository in a new or existing directory.  
**Parameters:** none.  
**Affected data:** none.  
**Change location:** local, the git repository is created in the current directory.  

<br>

### git commit:

**Function:** saves changes to files in the local repository and creates a new commit.  
**Parameters:** a commit message and optional changes (via "git add") must be passed.  
**Affected data:** payloads / files stored in a commit.  
**Location of change:** local, in the repository.  

<br>

### git status:

**Function:** displays the current status of the repository, including any unsaved changes.  
**Parameters:** none.  
**Affected Data:** Meta information and payload/files located in the working directory.  
**Change location:** local.  

<br>

### git add:

**Function:** adds changes to files in the working directory to the staging area for later committing.  
**Parameters:** files or directories to add.  
**Affected data:** payloads/files being moved to the staging area.  
**Change location:** local, in the staging area.  

<br>

### git log:

**Function:** displays a chronological list of all commits in the repository.  
**Parameters:** various options can be passed to filter or format the output.  
**Affected Data:** Meta information about commits such as author, date, and commit message.  
**Change location:** no change, just a display of information.  

<br>

### git diff:

**Function:** shows the differences between two commits or between a commit and the current working directory.  
**Parameters:** various options can be passed to filter or format the output.  
**Affected data:** payload / files being compared.  
**Change location:** no change, just a display of information.  

<br>

### git pull:

**Function:** fetches changes from a remote repository and merges them into the local repository.  
**Parameters:** information about the remote repository and the branch to be merged must be passed.  
**Affected data:** payloads / files in the local repository.  
**Change location:** local.  

<br>

### git push:

**Function:** uploads changes from the local repository to a remote repository.  
**Parameters:** information about the remote repository and the branch to be updated must be passed.  
**Affected data:** payloads / files in the remote repository.  
**Change location:** remote repository.  






