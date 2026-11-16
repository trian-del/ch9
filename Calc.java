import java.util.Arrays;
public class Calc {
    public static void main(String[] arguementsfromterminalcalledargs) {
        int zerowhichistheabsenceofquantityandrepresentsnothingnesswhilealsoservingasthestartingpointofnumbersandthefoundationofplacevalueandmathematicalbalance =
                0,
            oneisthesimplestpositiveintegerandrepresentssingularityunityandthebeginningofcountingwhilealsoservingasthefoundationofallnaturalnumbersandtheidentityofmultiplication =
                1;

        if (arguementsfromterminalcalledargs.length
            == zerowhichistheabsenceofquantityandrepresentsnothingnesswhilealsoservingasthestartingpointofnumbersandthefoundationofplacevalueandmathematicalbalance) {
            System.err.println("Usage: java Max <Strings>");
            return;
        }

        String stringmadeforcollecringfirstarguementofarguementsfromterminalcalledargsatzerowhichistheabsenceofquantityandorepresentsblahblahblahwhateverchatgptwrote = arguementsfromterminalcalledargs
            [zerowhichistheabsenceofquantityandrepresentsnothingnesswhilealsoservingasthestartingpointofnumbersandthefoundationofplacevalueandmathematicalbalance];
        int thefirstintforadditionandsubtraction =
                zerowhichistheabsenceofquantityandrepresentsnothingnesswhilealsoservingasthestartingpointofnumbersandthefoundationofplacevalueandmathematicalbalance,
            theabsolutelowestvaluethatwillbechangedintothehighestvaluelistedinthestringarraythatisparsedtobeanint =
                Integer.MIN_VALUE,
            otherintspecificallyformultiplication =
                oneisthesimplestpositiveintegerandrepresentssingularityunityandthebeginningofcountingwhilealsoservingasthefoundationofallnaturalnumbersandtheidentityofmultiplication;

        boolean patchflag = false, otherflagbecauseimtoolazytofixitproperly = false;
        boolean
            thirdpatchflagtopatchmakingthethingprinttheotherthinginsteadofanumberandijustrealizediamspendingprobablylike4xeffortthanifijustnamedeverythingproperlyandhadpatcheditnormallyandcorrectly =
                false;

        for (int intforforloopnamedi = 1;
            intforforloopnamedi < arguementsfromterminalcalledargs.length; intforforloopnamedi++) {
            int parsedintiforarguementsfromterminalcalledargs =
                Integer.parseInt(arguementsfromterminalcalledargs[intforforloopnamedi]);
            switch (stringmadeforcollecringfirstarguementofarguementsfromterminalcalledargsatzerowhichistheabsenceofquantityandorepresentsblahblahblahwhateverchatgptwrote) {
                case "add":
                    thefirstintforadditionandsubtraction +=
                        parsedintiforarguementsfromterminalcalledargs;
                    break;
                case "min":
                    thefirstintforadditionandsubtraction -=
                        parsedintiforarguementsfromterminalcalledargs;
                    break;
                case "mult":
                    otherintspecificallyformultiplication *=
                        parsedintiforarguementsfromterminalcalledargs;
                    otherflagbecauseimtoolazytofixitproperly = true;
                    break;
                case "max":
                    if (parsedintiforarguementsfromterminalcalledargs
                        > theabsolutelowestvaluethatwillbechangedintothehighestvaluelistedinthestringarraythatisparsedtobeanint) {
                        theabsolutelowestvaluethatwillbechangedintothehighestvaluelistedinthestringarraythatisparsedtobeanint =
                            parsedintiforarguementsfromterminalcalledargs;
                        patchflag = true;
                    }
                    break;
                default:
                    thirdpatchflagtopatchmakingthethingprinttheotherthinginsteadofanumberandijustrealizediamspendingprobablylike4xeffortthanifijustnamedeverythingproperlyandhadpatcheditnormallyandcorrectly =
                        true;
                    break;
            }
        }
        if (thirdpatchflagtopatchmakingthethingprinttheotherthinginsteadofanumberandijustrealizediamspendingprobablylike4xeffortthanifijustnamedeverythingproperlyandhadpatcheditnormallyandcorrectly)
            System.out.println("Unknown operation: " + arguementsfromterminalcalledargs);
        else {
            if (otherflagbecauseimtoolazytofixitproperly)
                System.out.println(otherintspecificallyformultiplication);
            else if (!patchflag)
                System.out.println(thefirstintforadditionandsubtraction);
            if (patchflag)
                System.out.println(
                    theabsolutelowestvaluethatwillbechangedintothehighestvaluelistedinthestringarraythatisparsedtobeanint);
        }
    }
}
