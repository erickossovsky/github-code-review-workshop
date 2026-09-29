# GitHub Workshop: your first real review

You will open a pull request, then review a teammate's pull request.
20 minutes. Same steps as in PetClinic, on a much smaller project.

## Pick your team's branch

Your team number is on the board. Your branch is `team-N` (for example `team-3`).
Each branch has one small Java file in the `exercises/` folder, based on a real PetClinic ticket.
Someone already did the work. Your job is to ask: is it good enough to merge?

## Roles

| Role | Job |
|------|-----|
| **Author** | Opens the pull request and answers the comments. |
| **Reviewer** | Runs the code and reviews it. |
| **Observer** (optional) | Reads along, helps the reviewer, and writes down one thing they learned. |

Swap roles at the end if you have time.

## Step 1: Open the pull request (Author, 5 min)

1. Go to the **Pull requests** tab, then **New pull request**.
2. Set **base: main** and **compare: team-N**. (The branch is already made for you.)
3. Title, PetClinic style: `type(JIRA-KEY): what it does`, no capitals. Example: `bug(BILL-CPC-1987): only unpaid bills can be paid`.
   The JIRA key is at the top of your Java file.
4. Answer **every question** in the description (JIRA, Context, Changes, How did you test it, Anything risky or unfinished, Before / After). Write real answers, not "ok".
5. On the right, click **Reviewers** and pick your teammate. Click **Create pull request**.

## Step 2: Review it (Reviewer, 10 min)

1. Open the PR. Read the description and the ticket at the top of the file.
2. **RUN IT.** Click the **Checks** tab, then **Run it**, then **Run the changed files**. Read the output.
   Does it match the "expected" text?
3. **Files changed** tab. Hover over a line, click the blue **+**, and leave at least **two comments**:
   - start each one with a label: `nit:` `suggestion:` `question:` `blocking:` `praise:`
   - say the **problem**, the **impact** (why it matters), and the **solution** (no "maybe", "probably", "should we")
   - no empty flattery: "amazing, perfect!" is not a review
   - if the fix is one line, use the **Add a suggestion** button (the ± icon)
4. Click **Review changes**, pick **Comment**, **Approve** or **Request changes**, and submit.

## Step 3: Reply (Author, 5 min)

1. Answer every comment (even just "done").
2. Fix it on the same branch: open the file, click the pencil icon, edit, and commit to `team-N`.
3. Click **Re-request review**.

## Run it on your own computer (optional)

You need Java 17. From the repo folder: `java exercises/BillAverage.java` (use your file's name).

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
