# GitHub Workshop: your first real review

You will open a pull request, then review a teammate's pull request.
20 minutes. No experience needed.

## Pick your team's branch

Your team number is on the board. Your branch is `team-N` (for example `team-3`).
Each branch has one small ticket in the `exercises/` folder. Someone already did the work.
Your job is to ask: is it good enough to merge?

## Roles

| Role | Job |
|------|-----|
| **Author** | Opens the pull request and answers the comments. |
| **Reviewer** | Runs the code and reviews it. |
| **Observer** (optional) | Reads along, helps the reviewer, and writes down one thing they learned. |

Swap roles at the end if you have time.

## Step 1: Open the pull request (Author, 5 min)

1. Go to the **Pull requests** tab, then **New pull request**.
2. Set **base: main** and **compare: team-N**.
3. Title: `feat(TEAM-N): what it does` (example: `feat(TEAM-1): add average`).
4. Answer the three questions in the description.
5. On the right, click **Reviewers** and pick your teammate. Click **Create pull request**.

## Step 2: Review it (Reviewer, 10 min)

1. Open the PR. Read the description and the ticket at the top of the file.
2. **RUN IT.** Click the **Checks** tab, then **Run it**, then **Run the changed files**. Read the output.
   Does it match what the ticket expects?
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

## Cheat sheet

| Label | Means | Blocks the merge? |
|-------|-------|-------------------|
| `nit:` | tiny detail | never |
| `suggestion:` | a better way | not by itself |
| `question:` | you do not know the intent | until answered |
| `blocking:` | it breaks something | yes, Request changes |
| `praise:` | something done well | never |

Good comment: **problem + impact + solution.**

> `blocking:` `average([2, 4, 6])` returns 3.0, expected 4.0. (problem)
> Every average the app shows is wrong. (impact)
> Divide by `len(numbers)`, not `len(numbers) + 1`. (solution)
