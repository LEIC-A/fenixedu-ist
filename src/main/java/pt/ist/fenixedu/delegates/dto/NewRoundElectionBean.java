/**
 * Copyright © 2002 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Core.
 *
 * FenixEdu Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Core.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.academic.dto.pedagogicalCouncil.elections;

import java.io.Serializable;
import java.util.List;

import org.fenixedu.academic.domain.elections.DelegateElection;
import org.fenixedu.academic.domain.student.Student;

public class NewRoundElectionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Student> candidates;

    public NewRoundElectionBean(List<Student> candidates, DelegateElection delegateElection) {
        setCandidates(candidates);
    }

    public boolean containsCandidates() {
        if (getCandidates() != null && getCandidates().size() > 0) {
            return true;
        }
        return false;
    }

    public void setCandidates(List<Student> candidates) {
        this.candidates = candidates;
    }

    public List<Student> getCandidates() {
        return candidates;
    }

}