# Facilitator guide (do not share with students)

24 pull requests are prepared (branches `team-1` to `team-24`, PR #k = team k). There are 8 scenarios, each repeated 3 times: team k gets scenario ((k - 1) mod 8) + 1, so teams 1, 9, 17 all review the same scenario. Each has a description written
with the PetClinic (CPC) template and a small Java change based on a real PetClinic ticket. Java 17, like PetClinic.
Five descriptions are wrong on purpose: reviewers must check the description against the code.

## Timing (20 min)

| Min | What |
|-----|------|
| 0-2 | Teams of 2-4. Hand out team numbers. Everyone opens the repo README and finds their PR. |
| 2-7 | READ: description, then the code, then run it. |
| 7-17 | REVIEW: 3+ labeled comments, one about the description, then a verdict. Walk the room. |
| 17-20 | REPLY: the author answers and fixes. Two teams read their best comment aloud. |

## Setup checklist

1. The repo is public and `main` is protected (no force push, no deletion, a review is required). Students need no access setup: anyone signed in to GitHub can comment on a public PR.
2. Students without write access can only leave **Comment** reviews (Approve and Request changes are disabled for them). The README tells them to write `Verdict: APPROVE` or `Verdict: REQUEST CHANGES` at the start of the review text. They also cannot push fixes: the author role only replies. Fix one PR live at the end to show suggested changes being committed.
3. Settings, Actions: allow workflows. The **Run it** check runs on every PR and prints the program output.
4. Do not merge any PR before class. Share the link to `PULL_REQUESTS.md`, or show it on screen.

## Answer key

Legend: **D** = the description is wrong. **C** = the code is wrong.

| Team | PR title | Description vs code | Problems planted | Best verdict |
|------|----------|---------------------|------------------|--------------|
| 1 | bug(BILL-CPC-1988): bill report | Accurate | C: `averageBill` divides by `size + 1` (prints 36.0, expected 45.0). C: `overdueBills` also returns PAID bills (3, expected 2). Dev notes are vague ("looked at the summary"). | Request changes |
| 2 | bug(BILL-CPC-1987): paid bills | **D** | C: `canPay` is inverted (`equals("PAID")`), so unpaid bills are rejected. C: the confirmation email is sent even when the payment is rejected. **D: says a unit test `BillPaymentTest` was added and "BUILD SUCCESSFUL": no test exists.** **D: says the email is sent once, only after success: false.** | Request changes |
| 3 | bug(CART-CPC-1944): promo codes | Accurate | C: `percentOff / 100` is integer division (0), promo does nothing (50.0, expected 45.0). C: `isValid` uses `<`, so the last valid day fails. C: no check on `percentOff`; 150 gives a 0.0 total. | Request changes |
| 4 | feat(CUST-CPC-1953): welcome message | Accurate | Only nits: unused `import java.util.Arrays`, commented-out debug line, misspelled variable `mesage`, magic number 3 in `badge`. Logic is correct. | **Approve** with nits (and a `praise:` for `petSummary`) |
| 5 | feat(AUTH-CPC-1973): weak passwords | **D** | C: `isStrongPassword` prints the password. **D: Dev notes say nothing is logged: false.** **D: says no new communication between services, but `notifyAuthService` POSTs to `http://auth-service`: that needs the C4 L2 updated.** Logic is correct. | Request changes |
| 6 | bug(VIST-CPC-1954): past visits | Accurate | C: `visitStatus` uses `>`, so a visit today is PAST (Luna, day 10). C: `nextVisit` keeps the last upcoming visit, not the earliest (Coco instead of Luna). | Request changes |
| 7 | feat(CART-CPC-1940): cart total with tax | **D** | C: hard-coded `MAILER_KEY` in the code. **D: Dev notes say no secrets or keys in the code: false.** **D: `.vscode` answer is "No", but the PR changes `.vscode/settings.json` (autoSave, build config): the template says the reviewer must comment on this and add cgerard321.** Math is correct. | Request changes |
| 8 | feat(INVT-CPC-1996): low stock | **D** | C: `<= 5` should be `< 5` (prints 3, expected 1). **D: says fewer than 5, code does at most 5.** **D: says only `LowStock.java` is changed, but `CartPromo.java` is also changed** (a ticket line deleted). **D: adds `restockReminder`, not mentioned anywhere.** | Request changes |

Team 4 is the "not everything is a blocker" team: watch for Request changes over nits.
Teams 5 and 7 print correct results, so running the code is not enough: the problem is in the code or the description.

## Model comments

- Team 2 (description): `blocking:` the description says a unit test `BillPaymentTest` was added and passes, but the PR has no test file. Reviewers cannot trust the "BUILD SUCCESSFUL" claim. Add the test or fix the description.
- Team 5: `blocking:` `isStrongPassword` prints the password, so anyone reading the logs sees it. Delete the println. Also the description says no new communication, but this calls the auth service: update the C4 L2.
- Team 7: `blocking:` the PR changes `.vscode/settings.json` but the description says no. The template requires an explanation and cgerard321 as reviewer.
- Team 8: `blocking:` the description says "fewer than 5" but `<= 5` counts products with exactly 5. countLowStock returns 3, expected 1. Use `< 5`.

## Coaching questions

- "Did you run it, or did you read it?"
- "Read the Changes list out loud. Is every line true?"
- "Is this a nit or a blocker? What happens if it stays?"
- "Where is the impact? Who does this hurt?"
- "Find the maybe in your comment and delete it."

## Wrap-up (last 2 min)

Ask two reviewers to read their best comment out loud. Ask the class: did it have a label? problem, impact, solution?
