/**
 *
 * $Id$
 */
package de.familytree.familytree.validation;

import de.familytree.familytree.Person;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.familytree.familytree.FamilyTree}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FamilyTreeValidator {
	boolean validate();

	boolean validateMembers(EList<Person> value);
}
