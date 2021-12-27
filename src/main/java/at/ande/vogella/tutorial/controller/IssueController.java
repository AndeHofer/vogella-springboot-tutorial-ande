/**
 * 
 */
package at.ande.vogella.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import at.ande.vogella.tutorial.entities.IssueReport;
import at.ande.vogella.tutorial.repositories.IssueRepository;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
@Controller
public class IssueController {

	IssueRepository issueRepository;

	@GetMapping("/issuereport")
	public String getReport(Model model) {
		model.addAttribute("issuereport", new IssueReport());
		return "issues/issuereport_form";
	}

	@PostMapping(value = "/issuereport")
	public String submitReport(IssueReport issueReport, Model model) {
		model.addAttribute("issuereport", new IssueReport());
		model.addAttribute("submitted", true);
		return "issues/issuereport_form";
	}

	@GetMapping("/issues")
	public String getIssues(Model model) {
		return "issues/issuereport_list";
	}
}