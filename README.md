# GitHub Code Review Workshop

You will review a real pull request. 20 minutes. Same steps as in PetClinic, on a much smaller project.

Eight pull requests are already open, one per team. Each one has a description written with the
PetClinic template, and a small Java change based on a real PetClinic ticket.
Your job: **is this pull request good enough to merge?**

## Find your pull request

Your team number is on the board. Open the **Pull requests** tab and find the one titled with your number
(`team-1` is the branch of the first one, and so on).

## Roles

| Role | Job |
|------|-----|
| **Reviewers** (1-2) | Read, run, and review the PR. |
| **Author** (1) | Plays the person who wrote the PR: answers the comments and fixes the code. |
| **Observer** (optional) | Reads along and writes down one thing they learned. |

## Step 1: Read it (5 min)

1. Read the **description**. It is filled with the PetClinic template: JIRA, Context, `.vscode`, Changes, v2 API,
   new communication between services, Before/After UI, Dev notes.
2. Open **Files changed**. Read the ticket at the top of each file.
3. **Does the description match the code?** Check each claim in Changes and Dev notes against the code.
   Some descriptions are wrong on purpose.
4. **RUN IT.** Click the **Checks** tab, then **Run it**, then **Run the changed files**. Read the output.
   Does it match the "expected" text?

## Step 2: Review it (10 min)

1. On **Files changed**, hover over a line, click the blue **+**, and leave at least **three comments**.
   - start each one with a label: `nit:` `suggestion:` `question:` `blocking:` `praise:`
   - say the **problem**, the **impact** (why it matters), and the **solution** (no "maybe", "probably", "should we")
   - no empty flattery: "amazing, perfect!" is not a review
   - if the fix is one line, use the **Add a suggestion** button (the ± icon)
2. At least one comment must be about the **description** (something it says that the code does not do).
   Write it on the PR conversation, not on a line of code.
3. Click **Review changes**, pick **Comment**, **Approve** or **Request changes**, and submit.

## Step 3: Reply (5 min)

1. Author: answer every comment (even just "done").
2. Fix it on the same branch: open the file, click the pencil icon, edit, and commit to `team-N`.
3. Click **Re-request review**.

## Run it on your own computer (optional)

You need Java 17. From the repo folder: `git checkout team-N`, then `java exercises/BillReport.java` (use the file changed in your PR).

## Cheat sheet

| Label | Means | Blocks the merge? |
|-------|-------|-------------------|
| `nit:` | tiny detail | never |
| `suggestion:` | a better way | not by itself |
| `question:` | you do not know why | until answered |
| `blocking:` | it breaks something | yes, Request changes |
| `praise:` | something done well | never |

Good comment: **problem + impact + solution.**

> `blocking:` a PAID bill can be paid again, so the owner is charged twice. (problem)
> Customers get billed twice. (impact)
> Check for PAID and throw an exception before saving. (solution)
