/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */
package hu.dpc.ob.rest.dto.psp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuppressWarnings("unused")
public class PspAccountsResponseDto {

    private List<PspAccountsLoanData> loanAccounts;
    private List<PspAccountsSavingsData> savingsAccounts;
    //TODO CREATE PspGroupLoanIndividualMonitoringAccounts
    private List<PspAccountsGuarantorData> groupLoanIndividualMonitoringAccounts;
    private List<PspAccountsShareData> shareAccounts ;
    private List<PspAccountsGuarantorData> guarantorAccounts;
}
