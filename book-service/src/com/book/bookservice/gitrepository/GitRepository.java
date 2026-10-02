package com.book.bookservice.gitrepository;

public class GitRepository {


    public int repositoryId;
    public String repositoryName;
    public String ownerName;
    public String visibility;
    public String branchName;



    @Override
    public boolean equals(Object obj){

        GitRepository git=(GitRepository) obj;


        if(this.repositoryId== git.repositoryId &&
        this.repositoryName.equals(git.repositoryName) &&
        this.ownerName.equals(git.ownerName) &&
        this.visibility.equals(git.visibility) &&
        this.branchName.equals(git.branchName)){
            return true;

        }
        return false;
    }
}
